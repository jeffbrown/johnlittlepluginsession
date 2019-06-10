package somepackage

import grails.web.api.ServletAttributes

class SomeService implements ServletAttributes {

    void someMethod() {
        // you can access the session property directly from here
        println session

        // ...
    }
}