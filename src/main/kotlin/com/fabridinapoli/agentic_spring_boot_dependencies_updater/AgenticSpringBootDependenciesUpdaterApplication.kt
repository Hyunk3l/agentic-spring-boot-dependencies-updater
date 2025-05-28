package com.fabridinapoli.agentic_spring_boot_dependencies_updater

import ai.koog.agents.ext.agent.simpleSingleRunAgent
import ai.koog.prompt.executor.clients.openai.OpenAIModels
import ai.koog.prompt.executor.llms.all.simpleOpenAIExecutor
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val apiKey = System.getenv("OPENAI_API_KEY")

    val agent = simpleSingleRunAgent(
        executor = simpleOpenAIExecutor(apiKey),
        systemPrompt = "You are a helpful assistant. Answer user questions concisely.",
        llmModel = OpenAIModels.Chat.GPT4o
    )

    val result = agent.runAndGetResult("Hello! How can you help me?")
    println(result)
}
