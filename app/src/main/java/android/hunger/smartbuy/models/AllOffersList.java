package android.hunger.smartbuy.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"startTime",
"endTime",
"title",
"description",
"url",
"category",
"imageUrls",
"availability"
})
public class AllOffersList {

@JsonProperty("startTime")
private Double startTime;
@JsonProperty("endTime")
private Double endTime;
@JsonProperty("title")
private String title;
@JsonProperty("description")
private String description;
@JsonProperty("url")
private String url;
@JsonProperty("category")
private String category;
@JsonProperty("imageUrls")
private List<ImageUrl> imageUrls = null;
@JsonProperty("availability")
private String availability;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("startTime")
public Double getStartTime() {
return startTime;
}

@JsonProperty("startTime")
public void setStartTime(Double startTime) {
this.startTime = startTime;
}

@JsonProperty("endTime")
public Double getEndTime() {
return endTime;
}

@JsonProperty("endTime")
public void setEndTime(Double endTime) {
this.endTime = endTime;
}

@JsonProperty("title")
public String getTitle() {
return title;
}

@JsonProperty("title")
public void setTitle(String title) {
this.title = title;
}

@JsonProperty("description")
public String getDescription() {
return description;
}

@JsonProperty("description")
public void setDescription(String description) {
this.description = description;
}

@JsonProperty("url")
public String getUrl() {
return url;
}

@JsonProperty("url")
public void setUrl(String url) {
this.url = url;
}

@JsonProperty("category")
public String getCategory() {
return category;
}

@JsonProperty("category")
public void setCategory(String category) {
this.category = category;
}

@JsonProperty("imageUrls")
public List<ImageUrl> getImageUrls() {
return imageUrls;
}

@JsonProperty("imageUrls")
public void setImageUrls(List<ImageUrl> imageUrls) {
this.imageUrls = imageUrls;
}

@JsonProperty("availability")
public String getAvailability() {
return availability;
}

@JsonProperty("availability")
public void setAvailability(String availability) {
this.availability = availability;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}