package br.ufal.ic.observer.magazine

import br.ufal.ic.observer.base.Observer

class SubscriberObserver(var name: String, var email: String) : Observer<String> {

    override fun update(value: String) {
        println("SubscriberObserver: I'm $name's subscriber")
        println("SubscriberObserver: Sending email to $email...")
        sendEmail(value)
    }

    private fun sendEmail(newPost: String) {
        // Send new post to our email
    }

}
