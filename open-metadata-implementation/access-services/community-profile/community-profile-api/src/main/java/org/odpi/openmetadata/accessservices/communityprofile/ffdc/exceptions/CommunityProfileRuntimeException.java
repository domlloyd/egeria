/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.accessservices.communityprofile.ffdc.exceptions;

import org.odpi.openmetadata.commonservices.ffdc.exceptions.OMAGRuntimeException;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CommunityProfileRuntimeException is used for all runtime exceptions generated by the Community Profile OMAS.
 * It is used in conjunction with the CommunityProfileErrorCode to provide first failure data capture for these errors.
 */
public class CommunityProfileRuntimeException extends OMAGRuntimeException
{
    private static final long    serialVersionUID = 1L;

    /**
     * This is the typical constructor used for creating an exception.
     *
     * @param httpCode           http response code to use if this exception flows over a rest call
     * @param className          name of class reporting error
     * @param actionDescription  description of function it was performing when error detected
     * @param errorMessage       description of error
     * @param systemAction       actions of the system as a result of the error
     * @param userAction         instructions for correcting the error
     * @param relatedProperties  arbitrary properties that may help with diagnosing the problem.
     */
    public CommunityProfileRuntimeException(int                 httpCode,
                                            String              className,
                                            String              actionDescription,
                                            String              errorMessage,
                                            String              systemAction,
                                            String              userAction,
                                            Map<String, Object> relatedProperties)
    {
        super(httpCode, className, actionDescription, errorMessage, systemAction, userAction, relatedProperties);
    }


    /**
     * This is the constructor used for creating an exception when an unexpected error has been
     * caught.
     *
     * @param httpCode           http response code to use if this exception flows over a rest call
     * @param className          name of class reporting error
     * @param actionDescription  description of function it was performing when error detected
     * @param errorMessage       description of error
     * @param systemAction       actions of the system as a result of the error
     * @param userAction         instructions for correcting the error
     * @param caughtError        previous error causing this exception
     * @param relatedProperties  arbitrary properties that may help with diagnosing the problem.
     */
    public CommunityProfileRuntimeException(int                 httpCode,
                                            String              className,
                                            String              actionDescription,
                                            String              errorMessage,
                                            String              systemAction,
                                            String              userAction,
                                            Throwable           caughtError,
                                            Map<String, Object> relatedProperties)
    {
        super(httpCode, className, actionDescription, errorMessage, systemAction, userAction, caughtError, relatedProperties);
    }


    /**
     * JSON-style toString
     *
     * @return string of property names and values for this enum
     */
    @Override
    public String toString()
    {
        return "CommunityProfileRuntimeException{" +
                "reportedHTTPCode=" + getReportedHTTPCode() +
                ", reportingClassName='" + getReportingClassName() + '\'' +
                ", reportingActionDescription='" + getReportingActionDescription() + '\'' +
                ", errorMessage='" + getErrorMessage() + '\'' +
                ", reportedSystemAction='" + getReportedSystemAction() + '\'' +
                ", reportedUserAction='" + getReportedUserAction() + '\'' +
                ", reportedCaughtException=" + getReportedCaughtException() +
                ", relatedProperties=" + getRelatedProperties() +
                '}';
    }
}