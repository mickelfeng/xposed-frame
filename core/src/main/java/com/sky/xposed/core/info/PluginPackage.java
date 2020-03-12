/*
 * Copyright (c) 2020 The sky Authors.
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

package com.sky.xposed.core.info;

/**
 * Created by sky on 2020-03-11.
 */
public class PluginPackage {

    private final String packageName;

    private PluginPackage(Build build) {
        this.packageName = build.packageName;
    }

    public String getPackageName() {
        return packageName;
    }

    public static class Build {

        private String packageName;

        public Build setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }

        public PluginPackage build() {
            return new PluginPackage(this);
        }
    }
}
