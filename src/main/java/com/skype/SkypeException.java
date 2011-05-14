/*******************************************************************************
 * Copyright (c) 2006-2007 Koji Hisano <hisano@gmail.com> - UBION Inc. Developer
 * Copyright (c) 2006-2007 UBION Inc. <http://www.ubion.co.jp/>
 * 
 * Copyright (c) 2006-2007 Skype Technologies S.A. <http://www.skype.com/>
 * 
 * Skype4Java is licensed under either the Apache License, Version 2.0 or
 * the Eclipse Public License v1.0.
 * You may use it freely in commercial and non-commercial products.
 * You may obtain a copy of the licenses at
 *
 *   the Apache License - http://www.apache.org/licenses/LICENSE-2.0
 *   the Eclipse Public License - http://www.eclipse.org/legal/epl-v10.html
 *
 * If it is possible to cooperate with the publicity of Skype4Java, please add
 * links to the Skype4Java web site <https://developer.skype.com/wiki/Java_API> 
 * in your web site or documents.
 * 
 * Contributors:
 * Koji Hisano - initial API and implementation
 * Bart Lamot - good javadocs
 ******************************************************************************/
package com.skype;

/**
 * Exception that will be thrown when the connection with Skype is not OK or unexpected events happen.
 * @author Koji Hisano
 */
public class SkypeException extends Exception {
    /**
	 * SerialVersionUID needed for serialisation.
	 */
	private static final long serialVersionUID = -4277557764382543108L;

	/**
	 * Constructor.
	 *
	 */
	SkypeException() {
    }

	/**
	 * Constructor with message to provide with the exception.
	 * @param message the exception message.
	 */
    SkypeException(String message) {
        super(message);
    }

    /**
     * Constructor not only with a message but also a cause.
     * @param message the exception message.
     * @param cause the exception cause.
     */
    SkypeException(String message, Throwable cause) {
        super(message, cause);
    }
}
