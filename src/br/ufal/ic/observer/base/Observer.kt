package br.ufal.ic.observer.base

interface Observer<T> {

    fun update(value: T)

}
