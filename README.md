## Shared

**Shared** is a Simple SharedPreference, annoyed when use SharedPreferences to save data.
You must declare `SharedPreference.Editor()` and then save with `apply()` or `commit()` every time.
This library is save your time.

## Usage

    // this : Context, fileName : a Preference file name.
    Shared shared = new Shared(this, name);

    // save data
    shared.save(key, value);

    // get data
    shared.get(key, value);

    // remove data
    shared.remove(key);

## License
- [WTFPL](http://www.wtfpl.net/faq/)