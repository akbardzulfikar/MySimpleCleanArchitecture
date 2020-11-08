package co.id.akbar.mysimplecleanarchitecture.data

import co.id.akbar.mysimplecleanarchitecture.domain.IMessageRepository

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}