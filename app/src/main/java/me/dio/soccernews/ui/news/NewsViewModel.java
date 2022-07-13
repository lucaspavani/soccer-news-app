package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO Remover Mock de Notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviária tem desfalque importante.", "Isso é uma descrição. Isso é uma descrição. Isso é uma descrição."));
        news.add(new News("Ferrinha joga no sábado", "Isso é uma descrição. Isso é uma descrição. Isso é uma descrição."));
        news.add(new News("Copa do Mundo Feminina está terminando", "Isso é uma descrição. Isso é uma descrição. Isso é uma descrição."));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return news;
    }
}