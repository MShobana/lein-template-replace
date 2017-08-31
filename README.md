# template-replace

A Leiningen plugin to do many wonderful things.

## Usage

FIXME: Use this for user-level plugins:

Put `[template-replace "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your `:user`
profile.

FIXME: Use this for project-level plugins:

Put `[template-replace "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your project.clj.

Exanple of usage inside project.clj:
  :template-replace [{:value-to-replace "1.1"                                                                                
                      :template-text "version"                                                                                 
                      :template-file "resources/public/index.template.html"                                                   
                      :output-file "resources/public/index.html"}]

FIXME: and add an example usage that actually makes sense:

    $ lein template-replace

## License

Copyright © 2017 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
