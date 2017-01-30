package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * PriceChanges
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-30T04:04:06.830Z")

public class PriceChanges   {
  private String id = null;

  private String name = null;

  private String club = null;

  private String status = null;

  private String percentageOwned = null;

  private String price = null;

  private String changes = null;

  private String delta = null;

  private String target = null;

  public PriceChanges id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier representing a specific player
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier representing a specific player")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PriceChanges name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Players Name
   * @return name
  **/
  @ApiModelProperty(value = "Players Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PriceChanges club(String club) {
    this.club = club;
    return this;
  }

   /**
   * Name of players Club
   * @return club
  **/
  @ApiModelProperty(value = "Name of players Club")
  public String getClub() {
    return club;
  }

  public void setClub(String club) {
    this.club = club;
  }

  public PriceChanges status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Flag to show if a player is active for price changes
   * @return status
  **/
  @ApiModelProperty(value = "Flag to show if a player is active for price changes")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PriceChanges percentageOwned(String percentageOwned) {
    this.percentageOwned = percentageOwned;
    return this;
  }

   /**
   * Percentage of managers who own thsi player
   * @return percentageOwned
  **/
  @ApiModelProperty(value = "Percentage of managers who own thsi player")
  public String getPercentageOwned() {
    return percentageOwned;
  }

  public void setPercentageOwned(String percentageOwned) {
    this.percentageOwned = percentageOwned;
  }

  public PriceChanges price(String price) {
    this.price = price;
    return this;
  }

   /**
   * Prive of player
   * @return price
  **/
  @ApiModelProperty(value = "Prive of player")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public PriceChanges changes(String changes) {
    this.changes = changes;
    return this;
  }

   /**
   * No of price changes this week
   * @return changes
  **/
  @ApiModelProperty(value = "No of price changes this week")
  public String getChanges() {
    return changes;
  }

  public void setChanges(String changes) {
    this.changes = changes;
  }

  public PriceChanges delta(String delta) {
    this.delta = delta;
    return this;
  }

   /**
   * Number of transfers thsi week
   * @return delta
  **/
  @ApiModelProperty(value = "Number of transfers thsi week")
  public String getDelta() {
    return delta;
  }

  public void setDelta(String delta) {
    this.delta = delta;
  }

  public PriceChanges target(String target) {
    this.target = target;
    return this;
  }

   /**
   * Percentage of price rise target reached
   * @return target
  **/
  @ApiModelProperty(value = "Percentage of price rise target reached")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceChanges priceChanges = (PriceChanges) o;
    return Objects.equals(this.id, priceChanges.id) &&
        Objects.equals(this.name, priceChanges.name) &&
        Objects.equals(this.club, priceChanges.club) &&
        Objects.equals(this.status, priceChanges.status) &&
        Objects.equals(this.percentageOwned, priceChanges.percentageOwned) &&
        Objects.equals(this.price, priceChanges.price) &&
        Objects.equals(this.changes, priceChanges.changes) &&
        Objects.equals(this.delta, priceChanges.delta) &&
        Objects.equals(this.target, priceChanges.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, club, status, percentageOwned, price, changes, delta, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceChanges {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    club: ").append(toIndentedString(club)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    percentageOwned: ").append(toIndentedString(percentageOwned)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

