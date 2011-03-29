/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.util.store;

import org.mule.api.config.MuleProperties;
import org.mule.api.store.ObjectStore;
import org.mule.tck.AbstractMuleTestCase;

/**
 * Test the configuration of an ObjectStore for the MuleContext.
 */
public class ObjectStoreConfigTestCase extends AbstractMuleTestCase
{
    public void testDefault()
    {
        ObjectStore store = muleContext.getObjectStore();
        assertNotNull(store);
        assertTrue(store instanceof InMemoryObjectStore);
    }

    public void testNonDefault() throws Exception
    {
        muleContext.getRegistry().registerObject(MuleProperties.OBJECT_STORE, new TextFileObjectStore());
        ObjectStore store = muleContext.getObjectStore();
        assertNotNull(store);
        assertTrue(store instanceof TextFileObjectStore);
    }
}


