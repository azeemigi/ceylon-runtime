/*
 * Copyright 2011 Red Hat inc. and third party contributors as noted 
 * by the author tags.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.something.xyz;

import com.redhat.ceylon.compiler.java.metadata.Import;
import com.redhat.ceylon.compiler.java.metadata.Module;

/**
 * @author <a href="mailto:ales.justin@jboss.org">Ales Justin</a>
 */
@Module(name = "net.something.xyz",
        version = "1.0.0.Final",
        dependencies = {
        @Import(name = "org.jboss.acme",
                version = "1.0.0.CR1",
                optional = true),
        @Import(name = "si.alesj.ceylon",
                version = "1.0.0.GA",
                optional = true)
})
public class module {
    public static ceylon.language.descriptor.Module getModule() {
        return null;
    }
}
