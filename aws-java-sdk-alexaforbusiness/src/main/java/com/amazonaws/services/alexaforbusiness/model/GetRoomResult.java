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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetRoom" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRoomResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details of the room requested.
     * </p>
     */
    private Room room;

    /**
     * <p>
     * The details of the room requested.
     * </p>
     * 
     * @param room
     *        The details of the room requested.
     */

    public void setRoom(Room room) {
        this.room = room;
    }

    /**
     * <p>
     * The details of the room requested.
     * </p>
     * 
     * @return The details of the room requested.
     */

    public Room getRoom() {
        return this.room;
    }

    /**
     * <p>
     * The details of the room requested.
     * </p>
     * 
     * @param room
     *        The details of the room requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRoomResult withRoom(Room room) {
        setRoom(room);
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
        if (getRoom() != null)
            sb.append("Room: ").append(getRoom());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRoomResult == false)
            return false;
        GetRoomResult other = (GetRoomResult) obj;
        if (other.getRoom() == null ^ this.getRoom() == null)
            return false;
        if (other.getRoom() != null && other.getRoom().equals(this.getRoom()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoom() == null) ? 0 : getRoom().hashCode());
        return hashCode;
    }

    @Override
    public GetRoomResult clone() {
        try {
            return (GetRoomResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}