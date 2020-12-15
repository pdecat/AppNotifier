/* Copyright 2020 Braden Farmer
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

package com.farmerbb.appnotifier.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.farmerbb.appnotifier.R
import com.farmerbb.appnotifier.initAppNotifierService
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        if(savedInstanceState == null) {
            initAppNotifierService()

            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, SettingsFragment())
                .commitNow()
        }
    }
}
