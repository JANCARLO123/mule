/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.runtime.config.spring.parsers.specific;

import org.mule.runtime.config.spring.factories.AsyncMessageProcessorsFactoryBean;
import org.mule.runtime.config.spring.parsers.generic.ChildDefinitionParser;

public class AsyncMessageProcessorsDefinitionParser extends ChildDefinitionParser {

  public AsyncMessageProcessorsDefinitionParser() {
    super("messageProcessor", AsyncMessageProcessorsFactoryBean.class);
  }
}
