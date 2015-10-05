# lein-scss-compiler

A Leiningen plugin to compile SCSS files to CSS.

This plugin is very much in alpha stage, contains a lot of hard coded values and
the performance is poor.

Requires sass (and compass) gems with their dependencies,
see https://github.com/lupapiste/scss-compiler.

## Usage

[![Clojars Project](http://clojars.org/lupapiste/lein-scss-compiler/latest-version.svg)](http://clojars.org/lupapiste/lein-scss-compiler)

Put lein-scss-compiler into the `:plugins` vector of your project.clj.

Run `lein scss-compiler` before packaging your Clojure software.

## License

Copyright © 2015 Solita Oy

Distributed under the Eclipse Public License, the same as Clojure.
