/**
 * This file is part of MEDrecord
 *
 * @copyright Copyright (c) 2008 Cambio Healthcare Systems, Sweden, Copyright (c) 2013 MEDvision360, The Netherlands.
 *   Licensed under the MPL 1.1/GPL 2.0/LGPL 2.1.
 * @author Leo Simons <leo@medvision360.com>
 * @author Ralph van Etten <ralph@medvision360.com>
 * @author Rong Chen <rong.acode@gmail.com>
 */
package com.medvision360.medrecord.pv;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.SortedMap;
import java.util.TreeMap;

import com.medvision360.medrecord.api.exceptions.SerializeException;
import org.openehr.rm.common.archetyped.Locatable;

// based on DADLBinding from reference implementation

@SuppressWarnings("rawtypes")
public class PVMapMaker extends AbstractPVSerializer
{
    private SortedMap<String, Object> m_map = new TreeMap<>();

    @Override
    public void serialize(Locatable locatable, OutputStream os) throws IOException, SerializeException
    {
        serialize(locatable, os, "UTF-8");
    }

    @Override
    public void serialize(Locatable locatable, OutputStream os, String encoding) throws IOException, SerializeException
    {
        // I feel like not putting the archetype in the path makes things a lot easier
        // String prefix = "[" + archetypeIdString + "]/";
        String prefix = "/";

        SerializeVisitor visitor = new PVMapMakerVisitor(m_map);

        try
        {
            walk(locatable, visitor, prefix);
        }
        catch (InvocationTargetException e)
        {
            throw new SerializeException("Problem walking the RM object model", e);
        }
        catch (IllegalAccessException e)
        {
            throw new SerializeException("Problem walking the RM object model", e);
        }
    }

    @Override
    public String getMimeType()
    {
        return "application/x-java-serialized-object";
    }

    @Override
    public String getFormat()
    {
        return "map-pv";
    }

    public SortedMap<String, Object> getMap()
    {
        return m_map;
    }
}
/*
 *  ***** BEGIN LICENSE BLOCK *****
 *  Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 *  The contents of this file are subject to the Mozilla Public License Version
 *  1.1 (the 'License'); you may not use this file except in compliance with
 *  the License. You may obtain a copy of the License at
 *  http://www.mozilla.org/MPL/
 *
 *  Software distributed under the License is distributed on an 'AS IS' basis,
 *  WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 *  for the specific language governing rights and limitations under the
 *  License.
 *
 * The Original Code is DADLBinding.java
 * 
 * The Initial Developer of the Original Code is Rong Chen. Portions created by
 * the Initial Developer are Copyright (C) 2003-2008 the Initial Developer. All
 * Rights Reserved.
 *
 *  Contributor(s): Leo Simons
 *
 * Software distributed under the License is distributed on an 'AS IS' basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 *  ***** END LICENSE BLOCK *****
 */
