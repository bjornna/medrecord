// WARNING, THIS FILE IS AUTOMATICALLY GENERATED
// DO NOT MODIFY !

package com.medvision360.medrecord.client.archetype;

import org.restlet.Client;
import org.restlet.data.Language;
import org.restlet.data.Preference;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import com.medvision360.lib.client.ClientResourceBase;
import com.medvision360.lib.client.ClientResourceConfig;
import com.medvision360.lib.client.ErrorDocument;
import com.medvision360.lib.common.exceptions.AnnotatedResourceException;
import com.medvision360.lib.common.exceptions.ApiException;

/**
    @apipath /archetype

 */
public class ArchetypeListResource extends ClientResourceBase
{
    /**
     * Constructor.
     *
     * <p>This constructor can be used to create a new client for this resource.</p>
     *
     * @param config_ Configuration object containing the location of the server
     *   this resource sends requests to.
     */
    public ArchetypeListResource(
        final ClientResourceConfig config_
    )
    {
        super(config_, "/archetype");
    }

    /**
       Create archetype resource.

Store an archetype from an ADL string (plain text). Will result in DUPLICATE_EXCEPTION if the archetype
already exists. If you want to update an archetype that's unused, you can delete it first and then re-upload
it. Updating archetypes once they are in use is not possible.

Note that for non-web-based tools, simply using the plain text API is probably much easier, i.e. something like
<code>curl -X POST -T foo.adl -H "Content-Type: text/plain" $URL/medrecord/v2/archetype</code>
works fine.



       <p>
       Use the {@link #postArchetype(com.medvision360.medrecord.api.archetype.ArchetypeRequest,ArchetypeListResourcePostArchetypeParams)}
       method to pass additional query arguments.</p>


       

     */
    public void postArchetype(
        final com.medvision360.medrecord.api.archetype.ArchetypeRequest archetype
    ) throws
        com.medvision360.medrecord.api.exceptions.DuplicateException,
        com.medvision360.medrecord.api.exceptions.ClientParseException,
        com.medvision360.medrecord.api.exceptions.MissingParameterException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
      postArchetype(
        archetype,
        null
      );
    }

    /**
       Create archetype resource.

Store an archetype from an ADL string (plain text). Will result in DUPLICATE_EXCEPTION if the archetype
already exists. If you want to update an archetype that's unused, you can delete it first and then re-upload
it. Updating archetypes once they are in use is not possible.

Note that for non-web-based tools, simply using the plain text API is probably much easier, i.e. something like
<code>curl -X POST -T foo.adl -H "Content-Type: text/plain" $URL/medrecord/v2/archetype</code>
works fine.



       @param queryParams_ The query parameters to be added to the request.

       
     */
    public void postArchetype(
        final com.medvision360.medrecord.api.archetype.ArchetypeRequest archetype,
        final ArchetypeListResourcePostArchetypeParams queryParams_
    ) throws
        com.medvision360.medrecord.api.exceptions.DuplicateException,
        com.medvision360.medrecord.api.exceptions.ClientParseException,
        com.medvision360.medrecord.api.exceptions.MissingParameterException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
        final ClientResource resource_ = getClientResource();
        try
        {
            if (queryParams_ != null)
            {
                queryParams_.applyTo(resource_);
            }

            final com.medvision360.medrecord.api.archetype.ArchetypeListResource wrapped_ = resource_.wrap(com.medvision360.medrecord.api.archetype.ArchetypeListResource.class);
            wrapped_.postArchetype(
                archetype
            );

            handleCookies(resource_);

            
        }
        catch(final ResourceException e_)
        {
            final ErrorDocument errorDocument_ = ErrorDocument.getFrom(resource_);
            if (errorDocument_ != null)
            {
                switch(errorDocument_.getCode())
                {
                    case "DUPLICATE_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.DuplicateException(errorDocument_.getArguments());
                    case "CLIENT_PARSE_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.ClientParseException(errorDocument_.getArguments());
                    case "MISSING_PARAMETER_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.MissingParameterException(errorDocument_.getArguments());
                    case "RECORD_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.RecordException(errorDocument_.getArguments());
                    case "IO_RECORD_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.IORecordException(errorDocument_.getArguments());
                }
            }
            throw e_;
        }
    }

    /**
       Create archetype resource.



       <p>
       Use the {@link #postArchetypeAsText(java.lang.String,ArchetypeListResourcePostArchetypeAsTextParams)}
       method to pass additional query arguments.</p>


       @apiacceptvariant postArchetype



     */
    public void postArchetypeAsText(
        final java.lang.String adl
    ) throws
        com.medvision360.medrecord.api.exceptions.DuplicateException,
        com.medvision360.medrecord.api.exceptions.ClientParseException,
        com.medvision360.medrecord.api.exceptions.MissingParameterException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
      postArchetypeAsText(
        adl,
        null
      );
    }

    /**
       Create archetype resource.



       @param queryParams_ The query parameters to be added to the request.

       @apiacceptvariant postArchetype


     */
    public void postArchetypeAsText(
        final java.lang.String adl,
        final ArchetypeListResourcePostArchetypeAsTextParams queryParams_
    ) throws
        com.medvision360.medrecord.api.exceptions.DuplicateException,
        com.medvision360.medrecord.api.exceptions.ClientParseException,
        com.medvision360.medrecord.api.exceptions.MissingParameterException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
        final ClientResource resource_ = getClientResource();
        try
        {
            if (queryParams_ != null)
            {
                queryParams_.applyTo(resource_);
            }

            final com.medvision360.medrecord.api.archetype.ArchetypeListResource wrapped_ = resource_.wrap(com.medvision360.medrecord.api.archetype.ArchetypeListResource.class);
            wrapped_.postArchetypeAsText(
                adl
            );

            handleCookies(resource_);

            
        }
        catch(final ResourceException e_)
        {
            final ErrorDocument errorDocument_ = ErrorDocument.getFrom(resource_);
            if (errorDocument_ != null)
            {
                switch(errorDocument_.getCode())
                {
                    case "DUPLICATE_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.DuplicateException(errorDocument_.getArguments());
                    case "CLIENT_PARSE_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.ClientParseException(errorDocument_.getArguments());
                    case "MISSING_PARAMETER_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.MissingParameterException(errorDocument_.getArguments());
                    case "RECORD_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.RecordException(errorDocument_.getArguments());
                    case "IO_RECORD_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.IORecordException(errorDocument_.getArguments());
                }
            }
            throw e_;
        }
    }

    /**
       List archetype resources.

Retrieve a list of archetype IDs known to the server encapsulated in JSON.



       <p>
       Use the {@link #listArchetypes(ArchetypeListResourceListArchetypesParams)}
       method to pass additional query arguments.</p>


       @apiqueryparam q A regular expression to limit the returned archetypes by their name.
[type=string,single,default=openEHR-EHR.*]



     */
    public com.medvision360.medrecord.api.IDList listArchetypes(
    ) throws
        com.medvision360.medrecord.api.exceptions.PatternException,
        com.medvision360.medrecord.api.exceptions.ParseException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
      return listArchetypes(
        null
      );
    }

    /**
       List archetype resources.

Retrieve a list of archetype IDs known to the server encapsulated in JSON.



       @param queryParams_ The query parameters to be added to the request.

       @apiqueryparam q A regular expression to limit the returned archetypes by their name.
[type=string,single,default=openEHR-EHR.*]


     */
    public com.medvision360.medrecord.api.IDList listArchetypes(
        final ArchetypeListResourceListArchetypesParams queryParams_
    ) throws
        com.medvision360.medrecord.api.exceptions.PatternException,
        com.medvision360.medrecord.api.exceptions.ParseException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
        final ClientResource resource_ = getClientResource();
        try
        {
            if (queryParams_ != null)
            {
                queryParams_.applyTo(resource_);
            }

            final com.medvision360.medrecord.api.archetype.ArchetypeListResource wrapped_ = resource_.wrap(com.medvision360.medrecord.api.archetype.ArchetypeListResource.class);
            final com.medvision360.medrecord.api.IDList result_ = wrapped_.listArchetypes(
            );

            handleCookies(resource_);

            return result_;
        }
        catch(final ResourceException e_)
        {
            final ErrorDocument errorDocument_ = ErrorDocument.getFrom(resource_);
            if (errorDocument_ != null)
            {
                switch(errorDocument_.getCode())
                {
                    case "PATTERN_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.PatternException(errorDocument_.getArguments());
                    case "PARSE_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.ParseException(errorDocument_.getArguments());
                    case "RECORD_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.RecordException(errorDocument_.getArguments());
                    case "IO_RECORD_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.IORecordException(errorDocument_.getArguments());
                }
            }
            throw e_;
        }
    }

}
