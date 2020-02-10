package br.ufal.ic.observer.magazine

import br.ufal.ic.observer.base.Observer

class WebsiteObserver : Observer<String> {

    override fun update(value: String) {
        println("WebsiteObserver: I'm the magazine website")
        println("WebsiteObserver: Updating website with new post...")
        addNewPost(value)
    }

    private fun addNewPost(post: String) {
        // Update website with post
    }

}
