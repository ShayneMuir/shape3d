package com.example;

import static org.lwjgl.opengl.GL11.*;


public class Cube {

    public void draw() {
        // Begin drawing cube
        glBegin(GL_QUADS);

        // Front face
        glColor3f(1, 0, 0);
        glVertex3f(-1, -1,  1);
        glVertex3f( 1, -1,  1);
        glVertex3f( 1,  1,  1);
        glVertex3f(-1,  1,  1);

        // Back face
        glColor3f(0, 1, 0);
        glVertex3f(-1, -1, -1);
        glVertex3f(-1,  1, -1);
        glVertex3f( 1,  1, -1);
        glVertex3f( 1, -1, -1);

        // Top face
        glColor3f(0, 0, 1);
        glVertex3f(-1,  1, -1);
        glVertex3f(-1,  1,  1);
        glVertex3f( 1,  1,  1);
        glVertex3f( 1,  1, -1);

        // Bottom face
        glColor3f(1, 1, 0);
        glVertex3f(-1, -1, -1);
        glVertex3f( 1, -1, -1);
        glVertex3f( 1, -1,  1);
        glVertex3f(-1, -1,  1);

        // Right face
        glColor3f(1, 0, 1);
        glVertex3f( 1, -1, -1);
        glVertex3f( 1,  1, -1);
        glVertex3f( 1,  1,  1);
        glVertex3f( 1, -1,  1);

        // Left face
        glColor3f(0, 1, 1);
        glVertex3f(-1, -1, -1);
        glVertex3f(-1, -1,  1);
        glVertex3f(-1,  1,  1);
        glVertex3f(-1,  1, -1);

        glEnd();
    }
}
