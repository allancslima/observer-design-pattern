package br.ufal.ic.observer.magazine

import br.ufal.ic.observer.base.Observer
import br.ufal.ic.observer.base.Subject

class MagazineSubject : Subject<String> {

    private val observers: MutableList<Observer<String>> = arrayListOf()
    private val posts: MutableList<String> = arrayListOf()

    override fun registerObserver(observer: Observer<String>) {
        observers.add(observer)
    }

    override fun unregisterObserver(observer: Observer<String>) {
        observers.remove(observer)
    }

    fun newPost(content: String) {
        posts.add(content)
        notifyObservers(content)
    }

    private fun notifyObservers(newPost: String) {
        observers.forEach { it.update(newPost) }
    }

}
