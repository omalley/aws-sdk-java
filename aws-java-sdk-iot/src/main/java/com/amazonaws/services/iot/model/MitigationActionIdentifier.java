/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information that identifies a mitigation action. This information is returned by ListMitigationActions.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MitigationActionIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The friendly name of the mitigation action.
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * The IAM role ARN used to apply this mitigation action.
     * </p>
     */
    private String actionArn;
    /**
     * <p>
     * The date when this mitigation action was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The friendly name of the mitigation action.
     * </p>
     * 
     * @param actionName
     *        The friendly name of the mitigation action.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The friendly name of the mitigation action.
     * </p>
     * 
     * @return The friendly name of the mitigation action.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The friendly name of the mitigation action.
     * </p>
     * 
     * @param actionName
     *        The friendly name of the mitigation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MitigationActionIdentifier withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * The IAM role ARN used to apply this mitigation action.
     * </p>
     * 
     * @param actionArn
     *        The IAM role ARN used to apply this mitigation action.
     */

    public void setActionArn(String actionArn) {
        this.actionArn = actionArn;
    }

    /**
     * <p>
     * The IAM role ARN used to apply this mitigation action.
     * </p>
     * 
     * @return The IAM role ARN used to apply this mitigation action.
     */

    public String getActionArn() {
        return this.actionArn;
    }

    /**
     * <p>
     * The IAM role ARN used to apply this mitigation action.
     * </p>
     * 
     * @param actionArn
     *        The IAM role ARN used to apply this mitigation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MitigationActionIdentifier withActionArn(String actionArn) {
        setActionArn(actionArn);
        return this;
    }

    /**
     * <p>
     * The date when this mitigation action was created.
     * </p>
     * 
     * @param creationDate
     *        The date when this mitigation action was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date when this mitigation action was created.
     * </p>
     * 
     * @return The date when this mitigation action was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date when this mitigation action was created.
     * </p>
     * 
     * @param creationDate
     *        The date when this mitigation action was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MitigationActionIdentifier withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getActionArn() != null)
            sb.append("ActionArn: ").append(getActionArn()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MitigationActionIdentifier == false)
            return false;
        MitigationActionIdentifier other = (MitigationActionIdentifier) obj;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getActionArn() == null ^ this.getActionArn() == null)
            return false;
        if (other.getActionArn() != null && other.getActionArn().equals(this.getActionArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getActionArn() == null) ? 0 : getActionArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public MitigationActionIdentifier clone() {
        try {
            return (MitigationActionIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.MitigationActionIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
