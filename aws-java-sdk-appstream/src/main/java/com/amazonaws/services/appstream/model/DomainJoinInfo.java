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
 * The <i>DirectoryName</i> and <i>OrganizationalUnitDistinguishedName</i> values, which are used to join domains for
 * the AppStream 2.0 streaming instances.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DomainJoinInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainJoinInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The fully qualified name of the directory, such as corp.example.com
     * </p>
     */
    private String directoryName;
    /**
     * <p>
     * The distinguished name of the organizational unit to place the computer account in.
     * </p>
     */
    private String organizationalUnitDistinguishedName;

    /**
     * <p>
     * The fully qualified name of the directory, such as corp.example.com
     * </p>
     * 
     * @param directoryName
     *        The fully qualified name of the directory, such as corp.example.com
     */

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    /**
     * <p>
     * The fully qualified name of the directory, such as corp.example.com
     * </p>
     * 
     * @return The fully qualified name of the directory, such as corp.example.com
     */

    public String getDirectoryName() {
        return this.directoryName;
    }

    /**
     * <p>
     * The fully qualified name of the directory, such as corp.example.com
     * </p>
     * 
     * @param directoryName
     *        The fully qualified name of the directory, such as corp.example.com
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainJoinInfo withDirectoryName(String directoryName) {
        setDirectoryName(directoryName);
        return this;
    }

    /**
     * <p>
     * The distinguished name of the organizational unit to place the computer account in.
     * </p>
     * 
     * @param organizationalUnitDistinguishedName
     *        The distinguished name of the organizational unit to place the computer account in.
     */

    public void setOrganizationalUnitDistinguishedName(String organizationalUnitDistinguishedName) {
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
    }

    /**
     * <p>
     * The distinguished name of the organizational unit to place the computer account in.
     * </p>
     * 
     * @return The distinguished name of the organizational unit to place the computer account in.
     */

    public String getOrganizationalUnitDistinguishedName() {
        return this.organizationalUnitDistinguishedName;
    }

    /**
     * <p>
     * The distinguished name of the organizational unit to place the computer account in.
     * </p>
     * 
     * @param organizationalUnitDistinguishedName
     *        The distinguished name of the organizational unit to place the computer account in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainJoinInfo withOrganizationalUnitDistinguishedName(String organizationalUnitDistinguishedName) {
        setOrganizationalUnitDistinguishedName(organizationalUnitDistinguishedName);
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
        if (getDirectoryName() != null)
            sb.append("DirectoryName: ").append(getDirectoryName()).append(",");
        if (getOrganizationalUnitDistinguishedName() != null)
            sb.append("OrganizationalUnitDistinguishedName: ").append(getOrganizationalUnitDistinguishedName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainJoinInfo == false)
            return false;
        DomainJoinInfo other = (DomainJoinInfo) obj;
        if (other.getDirectoryName() == null ^ this.getDirectoryName() == null)
            return false;
        if (other.getDirectoryName() != null && other.getDirectoryName().equals(this.getDirectoryName()) == false)
            return false;
        if (other.getOrganizationalUnitDistinguishedName() == null ^ this.getOrganizationalUnitDistinguishedName() == null)
            return false;
        if (other.getOrganizationalUnitDistinguishedName() != null
                && other.getOrganizationalUnitDistinguishedName().equals(this.getOrganizationalUnitDistinguishedName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryName() == null) ? 0 : getDirectoryName().hashCode());
        hashCode = prime * hashCode + ((getOrganizationalUnitDistinguishedName() == null) ? 0 : getOrganizationalUnitDistinguishedName().hashCode());
        return hashCode;
    }

    @Override
    public DomainJoinInfo clone() {
        try {
            return (DomainJoinInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.DomainJoinInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
