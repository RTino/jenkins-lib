package com.foo

static def color_sh(script, cmd) {
  wrap([$class: 'AnsiColorBuildWrapper', 'colorMapName': 'XTerm']) {
    script.sh cmd
  }
}
