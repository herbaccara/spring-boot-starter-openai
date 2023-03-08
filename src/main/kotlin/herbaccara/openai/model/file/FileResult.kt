package herbaccara.openai.model.file

import com.fasterxml.jackson.annotation.JsonProperty

data class FileResult(
    @field:JsonProperty("object")
    val `object`: String,
    val data: List<File>
)
