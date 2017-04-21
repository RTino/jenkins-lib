package com.foo
class Utilities {
  static def mvn(script, args) {
    script.sh "${script.tool 'Maven 3.3.9'}/bin/mvn -o ${args}"
  }
}
