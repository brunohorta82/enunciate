/**
 * Copyright © 2006-2016 Web Cohesion (info@webcohesion.com)
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
package com.webcohesion.enunciate.javac.decorations.type;

import com.webcohesion.enunciate.javac.decorations.DecoratedProcessingEnvironment;

import javax.lang.model.type.NoType;
import javax.lang.model.type.TypeVisitor;

/**
 * @author Ryan Heaton
 */
public class DecoratedNoType extends DecoratedTypeMirror<NoType> implements NoType {

  public DecoratedNoType(NoType delegate, DecoratedProcessingEnvironment env) {
    super(delegate, env);
  }

  public boolean isVoid() {
    return true;
  }

  @Override
  public <R, P> R accept(TypeVisitor<R, P> v, P p) {
    return v.visitNoType(this, p);
  }
}
