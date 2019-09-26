import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LiveCodeEditorComponent } from './live-code-editor.component';

describe('LiveCodeEditorComponent', () => {
  let component: LiveCodeEditorComponent;
  let fixture: ComponentFixture<LiveCodeEditorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LiveCodeEditorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LiveCodeEditorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
