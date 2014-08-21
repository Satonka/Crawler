package com.sam.gamestates;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.sam.entities.characters.pcs.PlayerCharacter;
import com.sam.managers.CameraManager;
import com.sam.managers.EntityManager;
import com.sam.managers.GameInputProcessor;
import com.sam.managers.GameStateManager;
import com.sam.entities.characters.Character;

public class PlayState extends GameState {

	private OrthographicCamera  		cam;
	public int 							WIDTH, HEIGHT;
	public TiledMap 					map;
	public OrthogonalTiledMapRenderer 	renderer;
	public Texture 						tex, tex2;
	public PlayerCharacter				guy;
	public Character					girl;
	public SpriteBatch					batch;
	public GameInputProcessor			processor;
	public CameraManager				camman;
	public EntityManager				entman;

	public PlayState(GameStateManager gsm) {
		super(gsm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() {
		map = new TmxMapLoader().load("tester3.tmx");
		
		entman = new EntityManager();
		 
		tex = new Texture(Gdx.files.internal("guy.png"));
		guy = new PlayerCharacter("Guy", map, tex, 4*16f, 27*16f, entman);
		
		tex2 = new Texture(Gdx.files.internal("girl.png"));
		girl = new Character("Girl", map, tex2, 5*16f, 26*16f, entman);
		
		WIDTH = Gdx.graphics.getWidth();
		HEIGHT = Gdx.graphics.getHeight();
		
		cam = new OrthographicCamera(WIDTH, HEIGHT); 
		
		camman = new CameraManager(cam, map);
		camman.itit();
		camman.target(guy);
        
		renderer = new OrthogonalTiledMapRenderer(map, 1f);
	
		processor = new GameInputProcessor();
		Gdx.input.setInputProcessor(processor);
	}

	@Override
	public void update(float dt) {
		WIDTH = Gdx.graphics.getWidth();
		HEIGHT = Gdx.graphics.getHeight();
		
		GL20 gl = Gdx.graphics.getGL20();

        gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        gl.glViewport(0, 0, WIDTH, HEIGHT);
           
        camman.target(guy);
        camman.update();
      
        guy.move();
        System.out.println(guy.getY());
	}

	@Override
	public void draw() {
	
		renderer.setView(cam);
		renderer.render();
		
		renderer.getSpriteBatch().begin();
		guy.draw(renderer.getSpriteBatch());
		girl.draw(renderer.getSpriteBatch());
		renderer.getSpriteBatch().end();		
	}

	@Override
	public void handleInput() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
}
