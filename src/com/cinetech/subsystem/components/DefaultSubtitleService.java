package com.cinetech.subsystem.components;

import com.cinetech.subsystem.interfaces.*;
import com.cinetech.utils.*;

public class DefaultSubtitleService implements ISubtitleService {
    @Override public void load(String movieName) { Logger.info("Serviço de Legendas: Carregando para o filme '" + movieName + "'"); }
    @Override public void enable() { Logger.info("Serviço de Legendas: Ativadas"); }
    @Override public void disable() { Logger.info("Serviço de Legendas: Desativadas"); }
}