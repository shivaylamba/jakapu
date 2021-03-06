/*
 * Copyright 2020 American Express Travel Related Services Company, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package com.americanexpress.jakapu.exceptions;


public class PublishingException extends RuntimeException {

    private static final long serialVersionUID = 1L;


    ErrorCodes errorCode;

    public PublishingException() {
        super();
        errorCode = ErrorCodes.JAKAPU_INTERNAL_ERROR;
    }

    public PublishingException(String message, ErrorCodes errorCode) {
        super(message);
        this.errorCode = errorCode;
    }


    public PublishingException(String message, Throwable cause) {
        super(message, cause);
    }


    public PublishingException(String message, Throwable cause, ErrorCodes errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public PublishingException(Throwable cause) {
        super(cause);
    }


    public ErrorCodes getErrorCode() {
        return errorCode;
    }

}
