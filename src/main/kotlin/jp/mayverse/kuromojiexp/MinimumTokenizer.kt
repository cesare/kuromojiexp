package jp.mayverse.kuromojiexp

import com.atilika.kuromoji.ipadic.Tokenizer

class MinimumTokenizer {
    fun tokenize(text: String) {
        val tokenizer = Tokenizer()
        for (token in tokenizer.tokenize(text)) {
            val result = "${token.baseForm} : ${token.partOfSpeechLevel1}"
            println(result)
        }
    }

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            val text = args[0]
            MinimumTokenizer().tokenize(text)
        }
    }
}
