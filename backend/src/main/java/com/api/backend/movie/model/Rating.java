
package com.api.backend.movie.model;

/**
 *
 * @author edwin
 */
public class Rating {
    
    private String id;
    private int score;
    private int voters;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getVoters() {
        return voters;
    }

    public void setVoters(int voters) {
        this.voters = voters;
    }

    @Override
    public String toString() {
        return "Rating{" + "id=" + id + ", score=" + score + ", voters=" + voters + '}';
    }
    
    
}
