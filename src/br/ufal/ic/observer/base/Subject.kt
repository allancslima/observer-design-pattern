package br.ufal.ic.observer.base

interface Subject<T> {

    fun registerObserver(observer: Observer<T>)

    fun unregisterObserver(observer: Observer<T>)

}
