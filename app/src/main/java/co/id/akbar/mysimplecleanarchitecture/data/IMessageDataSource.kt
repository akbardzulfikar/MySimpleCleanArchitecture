package co.id.akbar.mysimplecleanarchitecture.data

import co.id.akbar.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}