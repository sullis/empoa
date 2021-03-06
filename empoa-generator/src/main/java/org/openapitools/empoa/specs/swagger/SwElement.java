/*******************************************************************************
 * Copyright 2019 Jeremie Bresson
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package org.openapitools.empoa.specs.swagger;

import java.util.List;

import org.openapitools.empoa.specs.Element;
import org.openapitools.empoa.specs.IMember;

public class SwElement {

    public final Element mpElement;
    public final String swFqName;
    public final List<IMember> members;

    public SwElement(Element mpElement, String swFqName, List<IMember> members) {
        this.mpElement = mpElement;
        this.swFqName = swFqName;
        this.members = members;
    }
}
