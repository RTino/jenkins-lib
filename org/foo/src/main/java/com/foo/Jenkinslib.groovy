package com.foo

def color_sh(cmd){
    wrap([$class: 'AnsiColorBuildWrapper', 'colorMapName': 'XTerm']) {
        sh cmd
    }
}
