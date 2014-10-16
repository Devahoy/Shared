## Shared

**Shared** is a Simple Android SharedPreferences, annoyed when use SharedPreferences to save data.
You must declare `SharedPreference.Editor()` and then save with `apply()` or `commit()` every time.
This library is save your time.

## Installation

    1. Download [shared-0.0.1.aar](https://github.com/Devahoy/Shared/releases/download/v0.0.1/shared-0.0.1.aar) and save to libs folder.
    2. Open `build.gradle` then add dependencies

    compile fileTree(dir: 'libs', include: ['*.jar'])

    or

    compile files('libs/shared-0.0.1.aar')


## Usage

```java
// this : Context,
// name : a Preference file name.
Shared shared = new Shared(this, name);

// save data
shared.save(key, value);

// get data
shared.get(key, value);

// remove data
shared.remove(key);
```

## License
- [WTFPL](http://www.wtfpl.net/faq/)