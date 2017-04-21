package com.foo
class Utilities {
  static def color_sh(script, cmd) {
    wrap([$class: 'AnsiColorBuildWrapper', 'colorMapName': 'XTerm']) {
      script.sh cmd
    }
  }
}
