/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.module.extension.internal.runtime.config;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import org.mule.api.config.MuleProperties;
import org.mule.api.lifecycle.Disposable;
import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.Lifecycle;
import org.mule.api.lifecycle.Startable;
import org.mule.api.lifecycle.Stoppable;
import org.mule.extension.api.introspection.ConfigurationModel;
import org.mule.module.extension.internal.AbstractInterceptableContractTestCase;
import org.mule.tck.size.SmallTest;
import org.mule.tck.util.TestTimeSupplier;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@SmallTest
@RunWith(MockitoJUnitRunner.class)
public class LifecycleAwareConfigurationTestCase extends AbstractInterceptableContractTestCase<LifecycleAwareConfigurationInstance>
{

    private static final String NAME = "name";

    @Mock
    private ConfigurationModel configurationModel;

    @Mock
    private Lifecycle value;

    private TestTimeSupplier timeSupplier = new TestTimeSupplier(System.currentTimeMillis());

    @Before
    @Override
    public void before() throws Exception
    {
        super.before();
        muleContext.getRegistry().registerObject(MuleProperties.OBJECT_TIME_SUPPLIER, timeSupplier);
    }
    
    @Override
    protected LifecycleAwareConfigurationInstance createInterceptable()
    {
        return new LifecycleAwareConfigurationInstance(NAME, configurationModel, value, getInterceptors());
    }
    
    @Test
    public void valueInjected() throws Exception
    {
        interceptable.initialise();
        verify(injector).inject(value);
    }

    @Test
    public void valueInitialised() throws Exception
    {
        interceptable.initialise();
        verify((Initialisable) value).initialise();
        verify((Initialisable) value).initialise();
    }

    @Test
    public void valueStarted() throws Exception
    {
        interceptable.start();
        verify((Startable) value).start();
    }

    @Test
    public void valueStopped() throws Exception
    {
        interceptable.stop();
        verify((Stoppable) value).stop();
    }

    @Test
    public void valueDisposed() throws Exception
    {
        interceptable.dispose();
        verify((Disposable) value).dispose();
    }

    @Test
    public void getName()
    {
        assertThat(interceptable.getName(), is(NAME));
    }

    @Test
    public void getModel()
    {
        assertThat(interceptable.getModel(), is(sameInstance(configurationModel)));
    }

    @Test
    public void getValue()
    {
        assertThat(interceptable.getValue(), is(sameInstance(value)));
    }

    @Test(expected = IllegalStateException.class)
    public void getStatsBeforeInit()
    {
        interceptable.getStatistics();
    }

    @Test
    public void getStatistics() throws Exception
    {
        interceptable.initialise();
        assertThat(interceptable.getStatistics(), is(notNullValue()));
    }
}