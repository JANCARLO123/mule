/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.transport.xmpp.filters;

import static org.mule.util.ClassUtils.equal;
import static org.mule.util.ClassUtils.hash;

import org.jivesoftware.smack.filter.NotFilter;
import org.jivesoftware.smack.filter.PacketFilter;

/**
 * <code>XmppAndFilter</code> an Xmpp AND filter
 */
public class XmppNotFilter extends AbstractXmppFilter
{
    private volatile PacketFilter filter;

    public XmppNotFilter()
    {
        super();
    }

    public XmppNotFilter(PacketFilter filter)
    {
        this.filter = filter;
    }

    public void setFilter(PacketFilter filter)
    {
        this.filter = filter;
    }

    public PacketFilter getFilter()
    {
        return filter;
    }

    protected PacketFilter createFilter()
    {
        return new NotFilter(filter);
    }

    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        final XmppNotFilter other = (XmppNotFilter) obj;
        return equal(filter, other.filter);
    }

    public int hashCode()
    {
        return hash(new Object[]{this.getClass(), filter});
    }
}
