/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The <i>AccountName</i> and <i>AccountPassword</i> of the service account, to be used by the streaming instance to
 * connect to the directory.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ServiceAccountCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceAccountCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user name of an account in the directory that is used by AppStream 2.0 streaming instances to connect to the
     * directory. This account must have the following privileges: create computer objects, join computers to the
     * domain, change/reset the password on descendant computer objects for the organizational units specified.
     * </p>
     */
    private String accountName;
    /**
     * <p>
     * The password for the user account for directory actions.
     * </p>
     */
    private String accountPassword;

    /**
     * <p>
     * The user name of an account in the directory that is used by AppStream 2.0 streaming instances to connect to the
     * directory. This account must have the following privileges: create computer objects, join computers to the
     * domain, change/reset the password on descendant computer objects for the organizational units specified.
     * </p>
     * 
     * @param accountName
     *        The user name of an account in the directory that is used by AppStream 2.0 streaming instances to connect
     *        to the directory. This account must have the following privileges: create computer objects, join computers
     *        to the domain, change/reset the password on descendant computer objects for the organizational units
     *        specified.
     */

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * <p>
     * The user name of an account in the directory that is used by AppStream 2.0 streaming instances to connect to the
     * directory. This account must have the following privileges: create computer objects, join computers to the
     * domain, change/reset the password on descendant computer objects for the organizational units specified.
     * </p>
     * 
     * @return The user name of an account in the directory that is used by AppStream 2.0 streaming instances to connect
     *         to the directory. This account must have the following privileges: create computer objects, join
     *         computers to the domain, change/reset the password on descendant computer objects for the organizational
     *         units specified.
     */

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * <p>
     * The user name of an account in the directory that is used by AppStream 2.0 streaming instances to connect to the
     * directory. This account must have the following privileges: create computer objects, join computers to the
     * domain, change/reset the password on descendant computer objects for the organizational units specified.
     * </p>
     * 
     * @param accountName
     *        The user name of an account in the directory that is used by AppStream 2.0 streaming instances to connect
     *        to the directory. This account must have the following privileges: create computer objects, join computers
     *        to the domain, change/reset the password on descendant computer objects for the organizational units
     *        specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceAccountCredentials withAccountName(String accountName) {
        setAccountName(accountName);
        return this;
    }

    /**
     * <p>
     * The password for the user account for directory actions.
     * </p>
     * 
     * @param accountPassword
     *        The password for the user account for directory actions.
     */

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    /**
     * <p>
     * The password for the user account for directory actions.
     * </p>
     * 
     * @return The password for the user account for directory actions.
     */

    public String getAccountPassword() {
        return this.accountPassword;
    }

    /**
     * <p>
     * The password for the user account for directory actions.
     * </p>
     * 
     * @param accountPassword
     *        The password for the user account for directory actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceAccountCredentials withAccountPassword(String accountPassword) {
        setAccountPassword(accountPassword);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAccountName() != null)
            sb.append("AccountName: ").append(getAccountName()).append(",");
        if (getAccountPassword() != null)
            sb.append("AccountPassword: ").append(getAccountPassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceAccountCredentials == false)
            return false;
        ServiceAccountCredentials other = (ServiceAccountCredentials) obj;
        if (other.getAccountName() == null ^ this.getAccountName() == null)
            return false;
        if (other.getAccountName() != null && other.getAccountName().equals(this.getAccountName()) == false)
            return false;
        if (other.getAccountPassword() == null ^ this.getAccountPassword() == null)
            return false;
        if (other.getAccountPassword() != null && other.getAccountPassword().equals(this.getAccountPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        hashCode = prime * hashCode + ((getAccountPassword() == null) ? 0 : getAccountPassword().hashCode());
        return hashCode;
    }

    @Override
    public ServiceAccountCredentials clone() {
        try {
            return (ServiceAccountCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.ServiceAccountCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
