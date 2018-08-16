package jp.mayverse.kuromojiexp

import com.atilika.kuromoji.ipadic.Tokenizer

class MinimumTokenizer {
    fun tokenize(text: String) {
        val tokenizer = Tokenizer()
        for (token in tokenizer.tokenize(text)) {
            val results = arrayOf(
                token.baseForm,
                token.partOfSpeechLevel1,
                token.partOfSpeechLevel2,
                token.partOfSpeechLevel3,
                token.partOfSpeechLevel4
            )

            println(results.joinToString(separator = " : "))
        }
    }

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            val text = args[0]
            MinimumTokenizer().tokenize(text)
        }
    }
}
