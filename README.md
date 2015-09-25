# lein-scss-compiler

A Leiningen plugin to compile SCSS files to CSS.

This plugin is very much in alpha stage, contains a lot of hard coded values and
the performance is poor.

## Usage

Put `[lein-scss-compiler "0.1.4"]` into the `:plugins` vector of your project.clj.

Run `lein scss-compiler` before packaging your Clojure software.

## Requirements

### lupapiste/scss-compile

Depends on [lupapiste/scss-compiler](https://github.com/lupapiste/scss-compiler)
which is not in Clojars (yet). Install it manually:

    git clone https://github.com/lupapiste/scss-compiler.git
    cd scss-compiler
    lein install

### sass and compass gems with their dependencies

See https://github.com/lupapiste/scss-compiler

## License

Copyright © 2015 Solita Oy

Distributed under the Eclipse Public License, the same as Clojure.
