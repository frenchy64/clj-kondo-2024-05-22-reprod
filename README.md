# clj-kondo 2024-05-22 change

Run `./script/lint` with different versions of clj-kondo in deps.edn.

See `good.txt` for 2024.03.13.

See `bad.txt` for 2024-05-22.

It seems in 2024-05-22 the macro hook for `clojure.core.typed/loop` is no longer being found.
