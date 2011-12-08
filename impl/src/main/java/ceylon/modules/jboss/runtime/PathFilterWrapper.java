/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package ceylon.modules.jboss.runtime;

import org.jboss.modules.filter.PathFilter;

/**
 * Ceylon to Module path filter wrapper.
 *
 * @author <a href="mailto:ales.justin@jboss.org">Ales Justin</a>
 */
class PathFilterWrapper implements PathFilter {
    private final ceylon.language.descriptor.PathFilter filter;

    PathFilterWrapper(ceylon.language.descriptor.PathFilter filter) {
        if (filter == null)
            throw new IllegalArgumentException("Null filter");
        this.filter = filter;
    }

    public boolean accept(String path) {
        ceylon.language.String cs = ceylon.language.String.instance(path);
        return filter.accept(cs).booleanValue();
    }

    public String toString() {
        return filter.toString();
    }
}
