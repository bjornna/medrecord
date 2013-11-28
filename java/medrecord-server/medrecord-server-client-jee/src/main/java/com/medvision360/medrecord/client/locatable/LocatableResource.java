// WARNING, THIS FILE IS AUTOMATICALLY GENERATED
// DO NOT MODIFY !

package com.medvision360.medrecord.client.locatable;

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
    @apipath /locatable/{id}
 @apipathparam id An OpenEHR UIDBasedID value identifying a Locatable.
   [type=string,required,single,default=71350448-25BA-4395-B354-19B9CA9D5096]

 */
public class LocatableResource extends ClientResourceBase
{
    /**
     * Constructor.
     *
     * <p>This constructor can be used to create a new client for this resource.</p>
     *
     * @param config_ Configuration object containing the location of the server
     *   this resource sends requests to.
     * @param id An OpenEHR UIDBasedID value identifying a Locatable
     */
    public LocatableResource(
        final ClientResourceConfig config_,
        final String id
    )
    {
        super(config_, "/locatable/" + id);
    }

    /**
       Retrieve locatable resource.

Retrieve a locatable as a path/value JSON structure.



       <p>
       Use the {@link #getLocatable(LocatableResourceGetLocatableParams)}
       method to pass additional query arguments.</p>


       

     */
    public org.restlet.representation.Representation getLocatable(
    ) throws
        com.medvision360.medrecord.api.exceptions.NotFoundException,
        com.medvision360.medrecord.api.exceptions.ParseException,
        com.medvision360.medrecord.api.exceptions.InvalidLocatableIDException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
      return getLocatable(
        null
      );
    }

    /**
       Retrieve locatable resource.

Retrieve a locatable as a path/value JSON structure.



       @param queryParams_ The query parameters to be added to the request.

       
     */
    public org.restlet.representation.Representation getLocatable(
        final LocatableResourceGetLocatableParams queryParams_
    ) throws
        com.medvision360.medrecord.api.exceptions.NotFoundException,
        com.medvision360.medrecord.api.exceptions.ParseException,
        com.medvision360.medrecord.api.exceptions.InvalidLocatableIDException,
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

            final com.medvision360.medrecord.api.locatable.LocatableResource wrapped_ = resource_.wrap(com.medvision360.medrecord.api.locatable.LocatableResource.class);
            final org.restlet.representation.Representation result_ = wrapped_.getLocatable(
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
                    case "NOT_FOUND_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.NotFoundException(errorDocument_.getArguments());
                    case "PARSE_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.ParseException(errorDocument_.getArguments());
                    case "INVALID_LOCATABLE_ID_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.InvalidLocatableIDException(errorDocument_.getArguments());
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
       Delete locatable resource.

Delete a stored locatable. While deleting locatables is supported by this API, it should be an extremely rare
event to actually do such a deletion outside of testing. In OpenEHR, locatables are typically not deleted but
instead updated with new information, perhaps setting them to a different lifecycle state such as "suspended"
or "expired".



       <p>
       Use the {@link #deleteLocatable(LocatableResourceDeleteLocatableParams)}
       method to pass additional query arguments.</p>


       

     */
    public void deleteLocatable(
    ) throws
        com.medvision360.medrecord.api.exceptions.NotFoundException,
        com.medvision360.medrecord.api.exceptions.InvalidLocatableIDException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
      deleteLocatable(
        null
      );
    }

    /**
       Delete locatable resource.

Delete a stored locatable. While deleting locatables is supported by this API, it should be an extremely rare
event to actually do such a deletion outside of testing. In OpenEHR, locatables are typically not deleted but
instead updated with new information, perhaps setting them to a different lifecycle state such as "suspended"
or "expired".



       @param queryParams_ The query parameters to be added to the request.

       
     */
    public void deleteLocatable(
        final LocatableResourceDeleteLocatableParams queryParams_
    ) throws
        com.medvision360.medrecord.api.exceptions.NotFoundException,
        com.medvision360.medrecord.api.exceptions.InvalidLocatableIDException,
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

            final com.medvision360.medrecord.api.locatable.LocatableResource wrapped_ = resource_.wrap(com.medvision360.medrecord.api.locatable.LocatableResource.class);
            wrapped_.deleteLocatable(
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
                    case "NOT_FOUND_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.NotFoundException(errorDocument_.getArguments());
                    case "INVALID_LOCATABLE_ID_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.InvalidLocatableIDException(errorDocument_.getArguments());
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
       Update locatable resource.

Replace the contents of an existing locatable from a path/value JSON document. PUT cannot be used to create
new locatables; you need to use POST for that, instead. Note that any paths that were present in a previous
version of the locatable but are not present in the new JSON document result in removal of that information!
Accordingly, like with all REST APIs, it is important to be careful with concurrent updates of locatables from
multiple concurrent parties.

If there is a practical risk of multiple concurrent updates for a locatable, and you are only adding data,
you may wish to use the PATCH version of this API call which keeps the non-mentioned path/value pairs intact
and then only adds new information.

Support for safer concurrent requests using conditional puts and the locatable versioning model is planned but
not currently available.



       <p>
       Use the {@link #putLocatable(org.restlet.representation.Representation,LocatableResourcePutLocatableParams)}
       method to pass additional query arguments.</p>


       

     */
    public void putLocatable(
        final org.restlet.representation.Representation representation
    ) throws
        com.medvision360.medrecord.api.exceptions.NotFoundException,
        com.medvision360.medrecord.api.exceptions.ClientParseException,
        com.medvision360.medrecord.api.exceptions.NotSupportedException,
        com.medvision360.medrecord.api.exceptions.ValidationException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
      putLocatable(
        representation,
        null
      );
    }

    /**
       Update locatable resource.

Replace the contents of an existing locatable from a path/value JSON document. PUT cannot be used to create
new locatables; you need to use POST for that, instead. Note that any paths that were present in a previous
version of the locatable but are not present in the new JSON document result in removal of that information!
Accordingly, like with all REST APIs, it is important to be careful with concurrent updates of locatables from
multiple concurrent parties.

If there is a practical risk of multiple concurrent updates for a locatable, and you are only adding data,
you may wish to use the PATCH version of this API call which keeps the non-mentioned path/value pairs intact
and then only adds new information.

Support for safer concurrent requests using conditional puts and the locatable versioning model is planned but
not currently available.



       @param queryParams_ The query parameters to be added to the request.

       
     */
    public void putLocatable(
        final org.restlet.representation.Representation representation,
        final LocatableResourcePutLocatableParams queryParams_
    ) throws
        com.medvision360.medrecord.api.exceptions.NotFoundException,
        com.medvision360.medrecord.api.exceptions.ClientParseException,
        com.medvision360.medrecord.api.exceptions.NotSupportedException,
        com.medvision360.medrecord.api.exceptions.ValidationException,
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

            final com.medvision360.medrecord.api.locatable.LocatableResource wrapped_ = resource_.wrap(com.medvision360.medrecord.api.locatable.LocatableResource.class);
            wrapped_.putLocatable(
                representation
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
                    case "NOT_FOUND_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.NotFoundException(errorDocument_.getArguments());
                    case "CLIENT_PARSE_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.ClientParseException(errorDocument_.getArguments());
                    case "NOT_SUPPORTED_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.NotSupportedException(errorDocument_.getArguments());
                    case "VALIDATION_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.ValidationException(errorDocument_.getArguments());
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
       Append to locatable resource.

Add new path/value contents to an existing locatable from a JSON document. This API call serializes a
locatable into path/value pairs, then merges the newly supplied paths into that document,
parses the merged JSON back into a locatable, and stores that locatable again on the server. Because this
operation occurs on the server side and does not remove unknown paths, the risk of inadvertent removal of
information in the case of multiple concurrent writes is much <em>lower</em> but it is <em>still there</em>.

Support for safer concurrent requests using conditional puts and the locatable versioning model is planned but
not currently available.



       <p>
       Use the {@link #patchLocatable(org.restlet.representation.Representation,LocatableResourcePatchLocatableParams)}
       method to pass additional query arguments.</p>


       

     */
    public void patchLocatable(
        final org.restlet.representation.Representation representation
    ) throws
        com.medvision360.medrecord.api.exceptions.NotFoundException,
        com.medvision360.medrecord.api.exceptions.ClientParseException,
        com.medvision360.medrecord.api.exceptions.NotSupportedException,
        com.medvision360.medrecord.api.exceptions.ValidationException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
      patchLocatable(
        representation,
        null
      );
    }

    /**
       Append to locatable resource.

Add new path/value contents to an existing locatable from a JSON document. This API call serializes a
locatable into path/value pairs, then merges the newly supplied paths into that document,
parses the merged JSON back into a locatable, and stores that locatable again on the server. Because this
operation occurs on the server side and does not remove unknown paths, the risk of inadvertent removal of
information in the case of multiple concurrent writes is much <em>lower</em> but it is <em>still there</em>.

Support for safer concurrent requests using conditional puts and the locatable versioning model is planned but
not currently available.



       @param queryParams_ The query parameters to be added to the request.

       
     */
    public void patchLocatable(
        final org.restlet.representation.Representation representation,
        final LocatableResourcePatchLocatableParams queryParams_
    ) throws
        com.medvision360.medrecord.api.exceptions.NotFoundException,
        com.medvision360.medrecord.api.exceptions.ClientParseException,
        com.medvision360.medrecord.api.exceptions.NotSupportedException,
        com.medvision360.medrecord.api.exceptions.ValidationException,
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

            final com.medvision360.medrecord.api.locatable.LocatableResource wrapped_ = resource_.wrap(com.medvision360.medrecord.api.locatable.LocatableResource.class);
            wrapped_.patchLocatable(
                representation
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
                    case "NOT_FOUND_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.NotFoundException(errorDocument_.getArguments());
                    case "CLIENT_PARSE_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.ClientParseException(errorDocument_.getArguments());
                    case "NOT_SUPPORTED_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.NotSupportedException(errorDocument_.getArguments());
                    case "VALIDATION_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.ValidationException(errorDocument_.getArguments());
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
