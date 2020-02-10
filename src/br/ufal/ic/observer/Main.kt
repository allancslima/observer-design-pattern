package br.ufal.ic.observer

import br.ufal.ic.observer.magazine.MagazineSubject
import br.ufal.ic.observer.magazine.SubscriberObserver
import br.ufal.ic.observer.magazine.WebsiteObserver

class Main {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val magazine = MagazineSubject()
            val john = SubscriberObserver("John Doe", "john.doe@foo.bar")
            val jane = SubscriberObserver("Jane Doe", "jane.doe@foo.bar")
            val website = WebsiteObserver()

            magazine.registerObserver(john)
            magazine.registerObserver(jane)
            magazine.registerObserver(website)

            magazine.newPost(
                "Design Patterns: Observer" +
                 "The Observer Pattern defines a one to many dependencies between objects so that one object " +
                 "changes state, all of its dependents are notified and updated automatically."
            )
        }
    }

}
