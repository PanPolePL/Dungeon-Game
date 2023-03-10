package com.dungeongame.classes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import java.awt.*;

public class Block {
    public Rectangle rect;
    public Texture img;

    public Block(){
        rect = new Rectangle();
        rect.x = 500;
        rect.y = 500;
        rect.width = 80;
        rect.height = 80;
    }
    public void collisionCheck(){
        if(Entity.rect.y+Entity.rect.height > rect.y && Entity.rect.y < rect.y+rect.height){
            //left side
            if(Entity.rect.x+Entity.rect.width>rect.x && Entity.rect.x+Entity.rect.width<rect.x+5){
                Entity.rect.x = rect.x - Entity.rect.width;
            }
            //right side
            if(Entity.rect.x<rect.x+rect.width && Entity.rect.x>rect.x+rect.width-5){
                Entity.rect.x=rect.x+rect.width;
            }
        }

        if(Entity.rect.x+Entity.rect.width > rect.x && Entity.rect.x < rect.x+rect.width){
            //bottom side
            if(Entity.rect.y+Entity.rect.height>rect.y && Entity.rect.y+Entity.rect.height<rect.y+5){
                Entity.rect.y = rect.y-Entity.rect.height;
            }
            //top side
            if(Entity.rect.y<rect.y+rect.height && Entity.rect.y>rect.y+rect.height-5){
                Entity.rect.y=rect.y+rect.height;
            }
        }
    }
}
