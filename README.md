## Shared [![Build Status](https://travis-ci.org/Devahoy/Shared.svg?branch=master)](https://travis-ci.org/Devahoy/Shared)

**Shared** is a Simple Android SharedPreferences, annoyed when use SharedPreferences to save data.
Why you must declare `SharedPreference.Editor()` and then save with `apply()` or `commit()` every time.
This library is save your time.

## Download

Download [shared-0.0.1.jar](https://github.com/Devahoy/Shared/releases/download/v0.0.1/shared-0.0.1.jar) and save to libs folder

or Gradle

    dependencies {
        compile 'com.devahoy:shared:0.0.1'
    }

## Usage

```java
// this : Context,
// name : String, a SharedPreferences file name.
Shared shared = new Shared(this, name);

// Save data
shared.save(key, value);

// Get data
shared.get(key, value);

// Remove data
shared.remove(key);
```

## Example

```java
Shared shared = new Shared(this, "MyData");

// Save data.
shared.save("name", "Hello Kitty");
shared.save("age", 40);
shared.save("isAlive", true);

// Get data.
String name = shared.getString("name", "n/a");
int age = shared.getInt("age", 0);
boolean isAlive = shared.getBoolean("isAlive", false);

// Delete data.
shared.remove("name");
shared.remove("age");
shared.remove("isAlive");
```

## License

    Copyright 2014 DevAhoy

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
