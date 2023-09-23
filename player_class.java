import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * This class describes information about each player.
 */
public class Player {

    /**
     * Player's name.
     */
    private String d_name;
    /**
     * d    ?????
     * <p>  ?????????????????
     * /**
     * color of player's territories.
     */
    private String d_color;

    /**
     * List of player's countries.
     */
    List<Country> d_playerCountries;

    /**
     * List of player's Continents.
     */
    List<Continent> d_playerContinents;

    /**
     * List of player's orders.
     */
    List<Order> d_playerOrder;

    /**
     * Number of player's armies.
     */
    Integer d_numberOfPlayerArmies;

    /**
     * This parameterized constructor is used to create player with name and default
     * armies.
     *
     * @param p_playerName player name.  ???????????????????????
     */
    public Player(String p_playerName) {
        this.d_name = p_playerName;
        this.d_numberOfPlayerArmies = 0;
        this.d_playerOrder = new ArrayList<Order>(); /** ??????????????*/
    }

    /**
     * This is No argument constructor.   ?????????????????????????
     */
    public Player() {

    }

    /**
     * This is used to get player's name.
     *
     * @return return player name.      ??????????????????????
     */
    public String getPlayerName() {
        return d_name;
    }

    /**
     * This is used to set player's p_name.
     *
     * @param p_name set player name.         ????????????????????/
     */
    public void setPlayerName(String p_name) {
        this.d_name = p_name;
    }

    /**
     * This is used to get color code for player.
     *
     * @return Color ??????????????
     */
    public String getD_color() {
        return d_color;
    }

    /**
     * @param p_color ANSI color code.   ????????????????
     */
    public void setD_color(String p_color) {
        d_color = p_color;
    }

    /**
     * This getter is used to get list of countries of a player.
     *
     * @return return countries of a player.       ?????????????????????
     */
    public List<Country> getD_playerCountries() {
        return d_playerCountries;
    }

    /**
     * This setter is used to set list of countries of a player.
     *
     * @param p_playerCountries set countries of a player.    ????????????
     */
    public void setD_playerCountries(List<Country> p_playerCountries) {
        this.d_playerCountries = p_playerCountries;
    }

    /**
     * This getter is used to get list of continents of a player.
     *
     * @return return list of continents of a player.   ????????????????
     */
    public List<Continent> getD_playerContinents() {
        return d_playerContinents;
    }

    /**
     * This setter is used to set list of continents of a player.
     *
     * @param p_playerContinents set continents of a player.  ?????????????????????
     */
    public void setD_playerContinents(List<Continent> p_playerContinents) {
        this.d_playerContinents = p_playerContinents;
    }

    /**
     * This is used to get orders of a player.
     *
     * @return return execute orders.     ?????????????????
     */
    public List<Order> getD_playerOrder() {
        return d_playerOrder;
    }

    /**
     * This is used to set orders of a player.
     *
     * @param p_playerOrder set orders.    ???????????????????
     */
    public void setD_playerOrder(List<Order> p_playerOrder) {
        this.d_playerOrder = p_playerOrder;
    }

    /**
     * This is used to get number of armies of a player.
     *
     * @return return number of armies of a player.   ???????????????????
     */
    public Integer getD_numberOfPlayerArmies() {
        return d_numberOfPlayerArmies;
    }

    /**
     * This is used to set number of armies to a player.
     *
     * @param p_numberOfPlayerArmies set number of armies to a player.   ???????????????/
     */
    public void setD_numberOfPlayerArmies(Integer p_numberOfPlayerArmies) {
        this.d_numberOfPlayerArmies = p_numberOfPlayerArmies;
    }

}