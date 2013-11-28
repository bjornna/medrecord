// WARNING, THIS FILE IS AUTOMATICALLY GENERATED
// DO NOT MODIFY !

package com.medvision360.medrecord.client.query;

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
    @apipath /query/locatable

 */
public class QueryLocatableResource extends ClientResourceBase
{
    /**
     * Constructor.
     *
     * <p>This constructor can be used to create a new client for this resource.</p>
     *
     * @param config_ Configuration object containing the location of the server
     *   this resource sends requests to.
     */
    public QueryLocatableResource(
        final ClientResourceConfig config_
    )
    {
        super(config_, "/query/locatable");
    }

    /**
       Query locatable resources.

Retrieve a list of locatable IDs known to the server encapsulated in JSON, matching the constraints that are
expressed as query parameters. All the query parameter types are AND-ed together. This means that a query like
<code>archetype=openEHR-EHR-OBSERVATION.blood_pressure.v1&archetypeQ=DEMOGRAPHIC</code> is guaranteed to never
return any results. However, when repeating the same parameter type multiple times, those are OR-ed together.
That means a query like <code>archetypeQ=body_weight&archetypeQ=blood_pressure</code> returns all locatables
that are either body weights or blood pressures.

The query parameters are matched against the root locatable <em>or</em> any of its contents.
So if you have a COMPOSITION containing a blood_pressure OBSERVATION, then a query
<code>archetypeQ=blood_pressure</code> will return that entire COMPOSITION (including, perhaps,
other data besides the blood_pressure OBSERVATION). If this is not what you want,
you need to use an advanced query such as <code>/query/xquery</code> or <code>/query/xquery/locatable</code>.



       <p>
       Use the {@link #locatableQuery(QueryLocatableResourceLocatableQueryParams)}
       method to pass additional query arguments.</p>


       @apiqueryparam ehr An OpenEHR HierObjectID value specifying an EHR to search. Specify multiple times to search
multiple EHRs, or do not specify to search all EHRs.
[type=string,default=DC3BE110-DCF8-40C4-A8E3-AA1ADF78A959]
@apiqueryparam rmOriginator A string specifying a reference model originator (such as "openEHR") to
constrain results to. The provided parameter is compared against the archetype ID of the locatable and any
nested locatable contents. Specify
multiple times to allow multiple rm originators, or do not specify to not constrain the results at all.
[type=string,default=openEHR]
@apiqueryparam rmName A string specifying a reference model name (such as "EHR" or "DEMOGRAPHIC") to
constrain results to. The provided parameter is compared against the archetype ID of the locatable and any
nested locatable contents. Specify
multiple times to allow multiple rm names, or do not specify to not constrain the results at all.
[type=string,default=EHR]
@apiqueryparam conceptName A string specifying a reference model concept (such as "lab_test",
"medication" or "person) to constrain results to. The provided parameter is compared against the archetype ID
of the locatable and any nested locatable contents. Specify multiple times to allow multiple rm concepts, or
do not specify to not constrain the results at all.
[type=string,default=blood_pressure]
@apiqueryparam archetype A string specifying an archetype name to constrain results to. The provided parameter
is compared against the archetype ID of the locatable and any nested locatable contents. Specify multiple times
to allow multiple archetypes, or do not specify to not constrain the results at all.
[type=string,default=openEHR-EHR-OBSERVATION.blood_pressure.v1]
@apiqueryparam archetypeQ A regular expression qualifying archetype names to constrain results to.
The provided parameter is compared against the archetype ID of the locatable.
[type=string,default=openEHR-EHR-OBSERVATION.blood_pressure.v1]



     */
    public com.medvision360.medrecord.api.IDList locatableQuery(
    ) throws
        com.medvision360.medrecord.api.exceptions.InvalidArchetypeIDException,
        com.medvision360.medrecord.api.exceptions.AnnotatedIllegalArgumentException,
        com.medvision360.medrecord.api.exceptions.PatternException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
      return locatableQuery(
        null
      );
    }

    /**
       Query locatable resources.

Retrieve a list of locatable IDs known to the server encapsulated in JSON, matching the constraints that are
expressed as query parameters. All the query parameter types are AND-ed together. This means that a query like
<code>archetype=openEHR-EHR-OBSERVATION.blood_pressure.v1&archetypeQ=DEMOGRAPHIC</code> is guaranteed to never
return any results. However, when repeating the same parameter type multiple times, those are OR-ed together.
That means a query like <code>archetypeQ=body_weight&archetypeQ=blood_pressure</code> returns all locatables
that are either body weights or blood pressures.

The query parameters are matched against the root locatable <em>or</em> any of its contents.
So if you have a COMPOSITION containing a blood_pressure OBSERVATION, then a query
<code>archetypeQ=blood_pressure</code> will return that entire COMPOSITION (including, perhaps,
other data besides the blood_pressure OBSERVATION). If this is not what you want,
you need to use an advanced query such as <code>/query/xquery</code> or <code>/query/xquery/locatable</code>.



       @param queryParams_ The query parameters to be added to the request.

       @apiqueryparam ehr An OpenEHR HierObjectID value specifying an EHR to search. Specify multiple times to search
multiple EHRs, or do not specify to search all EHRs.
[type=string,default=DC3BE110-DCF8-40C4-A8E3-AA1ADF78A959]
@apiqueryparam rmOriginator A string specifying a reference model originator (such as "openEHR") to
constrain results to. The provided parameter is compared against the archetype ID of the locatable and any
nested locatable contents. Specify
multiple times to allow multiple rm originators, or do not specify to not constrain the results at all.
[type=string,default=openEHR]
@apiqueryparam rmName A string specifying a reference model name (such as "EHR" or "DEMOGRAPHIC") to
constrain results to. The provided parameter is compared against the archetype ID of the locatable and any
nested locatable contents. Specify
multiple times to allow multiple rm names, or do not specify to not constrain the results at all.
[type=string,default=EHR]
@apiqueryparam conceptName A string specifying a reference model concept (such as "lab_test",
"medication" or "person) to constrain results to. The provided parameter is compared against the archetype ID
of the locatable and any nested locatable contents. Specify multiple times to allow multiple rm concepts, or
do not specify to not constrain the results at all.
[type=string,default=blood_pressure]
@apiqueryparam archetype A string specifying an archetype name to constrain results to. The provided parameter
is compared against the archetype ID of the locatable and any nested locatable contents. Specify multiple times
to allow multiple archetypes, or do not specify to not constrain the results at all.
[type=string,default=openEHR-EHR-OBSERVATION.blood_pressure.v1]
@apiqueryparam archetypeQ A regular expression qualifying archetype names to constrain results to.
The provided parameter is compared against the archetype ID of the locatable.
[type=string,default=openEHR-EHR-OBSERVATION.blood_pressure.v1]


     */
    public com.medvision360.medrecord.api.IDList locatableQuery(
        final QueryLocatableResourceLocatableQueryParams queryParams_
    ) throws
        com.medvision360.medrecord.api.exceptions.InvalidArchetypeIDException,
        com.medvision360.medrecord.api.exceptions.AnnotatedIllegalArgumentException,
        com.medvision360.medrecord.api.exceptions.PatternException,
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

            final com.medvision360.medrecord.api.query.QueryLocatableResource wrapped_ = resource_.wrap(com.medvision360.medrecord.api.query.QueryLocatableResource.class);
            final com.medvision360.medrecord.api.IDList result_ = wrapped_.locatableQuery(
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
                    case "INVALID_ARCHETYPE_ID_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.InvalidArchetypeIDException(errorDocument_.getArguments());
                    case "ILLEGAL_ARGUMENT_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.AnnotatedIllegalArgumentException(errorDocument_.getArguments());
                    case "PATTERN_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.PatternException(errorDocument_.getArguments());
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
