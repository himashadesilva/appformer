/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.livespark.formmodeler.codegen.services.datamodeller;

import org.kie.workbench.common.services.datamodeller.core.DataObject;
import org.uberfire.backend.vfs.Path;

/**
 * Created by pefernan on 4/29/15.
 */
public interface DataModellerFormGenerator {
    public void generateFormForDataObject( DataObject dataObject, Path path );
}