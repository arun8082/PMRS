import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProjectrepositoryComponent } from './projectrepository.component';

describe('ProjectrepositoryComponent', () => {
  let component: ProjectrepositoryComponent;
  let fixture: ComponentFixture<ProjectrepositoryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProjectrepositoryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProjectrepositoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
